package com.sap.tutor.clean.architecture.shop.bootstrap.e2e;

import com.sap.tutor.clean.architecture.shop.drivers.Launcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.sap.tutor.clean.architecture.shop.adapter.in.rest.HttpTestCommons.TEST_PORT;

abstract class EndToEndTest {

  private static Launcher launcher;

  @BeforeAll
  static void init() {
    launcher = new Launcher();
    launcher.startOnPort(TEST_PORT);
  }

  @AfterAll
  static void stop() {
    launcher.stop();
  }
}
