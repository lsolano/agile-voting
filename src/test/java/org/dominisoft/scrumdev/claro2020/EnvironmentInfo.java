package org.dominisoft.scrumdev.claro2020;

public final class EnvironmentInfo {
  final String homeDirectory;
  final boolean isWindowsOs;

  EnvironmentInfo(final String homeDirectory, final boolean isWindowsOs) {
    this.homeDirectory = homeDirectory;
    this.isWindowsOs = isWindowsOs;
  }
}
