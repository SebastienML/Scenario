Feature: extract the documentation by a publishment
  extract into a zip file

  @tag1
  Scenario: As a storeHouseManager, i can publish and download the zip file
  Given I log with the username "stmgr1" and  the password "stmgr1"
  Then I go to publishing and select the product "EDC" and the version "Version 2"
  Then Create a web html Package
  Then Select all the status
  And Publish
  When i download the Zip
  And check if the Zip has been download
  