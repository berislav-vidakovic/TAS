## Test Automation Solution (TAS)

<div style="margin-bottom: 12px;">
<img src = "docs/images/pw.png" /> 
<img src = "docs/images/java.png" /> 
</div>

This TAS covers 3 System Under Test (SUT):
- WebShop 
- ChatApp 
- Games 

Run TAS for each SUT:
  ```bash
  mvn test -Dtest=WebShopTest
  ```
  ```bash
  mvn test -Dtest=ChatAppTest
  ```
  ```bash
  mvn test -Dtest=GamesTest
  ```


Add environment variable to gitlab.yml
  ```yaml
  HEADLESS: "true"
  ```

Build scheduled Pipeline on GitLab
  - Build - Pipeline schedules - New schedule

  