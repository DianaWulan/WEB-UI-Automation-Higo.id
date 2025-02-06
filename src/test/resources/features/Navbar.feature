Feature: Navbar

  @navbar @positive @tantangHigo
  Scenario: check navbar tantangHigo
    Given enter the higo website
    When user click TentangHigo
    Then user in the TentangHigo page
    And check JadiBagianHigo button

  @navbar @positive @layananHigo
  Scenario: check navbar layananHigo WifiAdv
    Given enter the higo website
    When user click LayananHigo
    And user click WifiAdv
    Then user in the WifiAdv page
    And check BeriklanSekarang button

  @navbar @positive @layananHigo
  Scenario: check navbar layananHigo HigoSpot
    Given enter the higo website
    When user click LayananHigo
    And user click HigoSpot
    Then user in the HigoSpot page
    And check GabungSekarang button

  @navbar @positive @layananHigo
  Scenario: check navbar layananHigo IDA
    Given enter the higo website
    When user click LayananHigo
    And user click IDA
    Then user in the IDA page
    And check KolaborasiSekarang button

  @navbar @positive @studykasus
  Scenario: check all navbar studykasus
    Given enter the higo website
    When user click studykasus
    Then user in the studykasus page
    And check All button
    And check Higospot button
    And check WifiAdv button

  @navbar @positive @blog
  Scenario: check all navbar blog
    Given enter the higo website
    When user click blog
    Then user in the blog page

  @navbar @positive @DigitalReport
  Scenario: check all navbar Digital Report
    Given enter the higo website
    When user click DigitalReport
    Then user in the DigitalReport page

  @navbar @positive @hubungiTim
  Scenario: check all navbar Hubungi Tim Higo
    Given enter the higo website
    When user click Hubungi Tim Higo
    Then user in the Hubungi Tim Higo page

  @navbar @positive @bahasa
  Scenario: check all navbar Bahasa Indonesia
    Given enter the higo website
    When user click Bahasa Indonesia
    Then website berbahasa Indonesia

  @navbar @positive @bahasa
  Scenario: check all navbar Bahasa Inggris
    Given enter the higo website
    When user click Bahasa Inggris
    Then website berbahasa Inggris


