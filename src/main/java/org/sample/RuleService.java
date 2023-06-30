package org.sample;

import static org.sample.common.GenericUtils.getResourceFilePath;

import java.util.Map;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.Match;

public class RuleService {
  public void fireAllRules(Map<String, Object> factMap) {
    KieServices kServices = KieServices.Factory.get();
    KieFileSystem kfs = kServices.newKieFileSystem();
    KieRepository kr = kServices.getRepository();
    var resource =
        kServices
            .getResources()
            .newFileSystemResource(getResourceFilePath("drls/ruleAuto.drl"))
            .setResourceType(ResourceType.DRL);
    kfs.write(resource);
    KieBuilder kb = kServices.newKieBuilder(kfs);
    kb.buildAll();
    KieContainer kContainer = kServices.newKieContainer(kr.getDefaultReleaseId());
    KieSession kSession = kContainer.newKieSession();
    kSession.insert(factMap);
    kSession.fireAllRules(new AgendaFilter() {
      @Override
      public boolean accept(Match match) {
        System.out.println("Match rule name "+match.getRule().getName());
        return true;
      }
    });
  }
}
