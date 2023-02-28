# Installing Maven on Windows, Linux and MacOS

## Windows
1. Download the latest version of Maven from the official website: https://maven.apache.org/download.cgi
2. Extract the downloaded archive to the desired location, for example `C:\Program Files\Apache\maven`.
3. Add the `bin` directory of the extracted folder to the `PATH` environment variable.
4. Open the Command Prompt or Power Shell and run the following command to verify the installation:

## Linux
1. Update the package index:
  ```bash 
  sudo apt update
  ```
2. Install Maven using the following command:
  ```bash
  sudo apt install maven
  ```
3. Verify the installation by running the following command in the terminal:
   ```bash
   mvn -version
   ```


## MacOS
1. Install Homebrew using the following command:
  ```bash
  brew install maven
  ```
2. Verify the installation by running the following command in the terminal:
  ```bash
  mvn -v
  ```

## Running and Automating Tests
- Navigaate to this directory 
- Run to install dependecies.
```bash
mvn install
``` 

- Run 
```bash mvn test
``` 
The above command will execute all the tests in the project that are defined in the `src/test/java` directory.
- The results of the tests will be displayed in the terminal/command prompt and also recorded in the `target/surefire-reports` directory.

## Automating Tests
- You can automate the tests by adding the mvn test command to your Continuous Integration (CI) pipeline, which will run the tests every time you push changes to your code repository. 
- For example, you can use popular CI/CD tools such as Jenkins, Travis CI, CircleCI, etc.

```bash
mvn test
``` 
```bash
  [INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/sphesihle/Downloads/HyperionDev-Coding-Mentor/Section_C/demo/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/sphesihle/Downloads/HyperionDev-Coding-Mentor/Section_C/demo/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ demo ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.SolutionTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.021 s - in com.example.SolutionTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.228 s
[INFO] Finished at: 2023-02-04T08:56:46+02:00
[INFO] ------------------------------------------------------------------------
```

