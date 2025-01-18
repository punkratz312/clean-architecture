//package com.potucek.clean.architecture.shop.adapter.e2e;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//
//import static com.potucek.clean.architecture.shop.adapter.in.rest.HttpTestCommons.TEST_PORT;
//
//
//abstract class EndToEndTest {
//
//  private static Launcher launcher;
//
//  @BeforeAll
//  static void init() {
//    launcher = new Launcher();
//    launcher.startOnPort(TEST_PORT);
//  }
//
//  @AfterAll
//  static void stop() {
//    launcher.stop();
//  }
//}
