Feature:US16 Onerilen urunler sepete eklenmeli


  @wip
  Scenario:TC24 Sepete eklenen urunlerin sepette oldugu dogrulanmali


    Given Navigate to url "toAutoUrl"
    Then  Scroll to bottom of page
    Then  Verify RECOMMENDED ITEMS are visible
    Then  Click on Add To Cart on Recommended product
    Then  Click on View Cart button
    Then  Verify that product is displayed in cart page and close the page
