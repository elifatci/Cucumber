Feature:Positive Login Test

  @wip
  Scenario:Smoke Test

    * Open page
    * Type username student into Username field
    * Type password Password123 into Password field
    * Puch Submit button
    * Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    * Verify new page contains expected text ("Congratulations" or "successfully logged in")
    * Verify button Log out is displayed on the new page