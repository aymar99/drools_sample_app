package org.sample;


import org.sample.common.RuleEngineConstants;

public class Main {


  public static void main(String[] args) {
      RuleService ruleService=new RuleService();
      ruleService.fireAllRules(RuleEngineConstants.SAMPLE_FACTS);
  }
}
