package org.sample.common;

import java.util.Objects;

public class GenericUtils {
  static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

  public static String getResourceFilePath(String fileName) {
    return Objects.requireNonNull(classLoader.getResource(fileName)).getPath();
  }
}
