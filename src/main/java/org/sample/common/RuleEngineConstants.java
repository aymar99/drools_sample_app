package org.sample.common;

import java.util.HashMap;
import java.util.Map;

public final class RuleEngineConstants {
  private RuleEngineConstants() {}

  public static final String SALIENCE = "salience";

  public static final Map<String, Object> SAMPLE_FACTS =
      new HashMap<>(
          Map.ofEntries(
              Map.entry("age", 15),
              Map.entry("AlreadySeen", false),
              Map.entry("clicks", 250),
              Map.entry("totalHistoryOfProfitFromSales", 500),
              Map.entry("customerProfitInLastMonth", 1000),
              Map.entry("area", "URBAN"),
              Map.entry("profitPredictionFrom3rdPartyData", 1000),
              Map.entry("marketingDecision", ""),
              Map.entry("ruleId", "")));

}
