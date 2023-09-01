# Test Classes Description

## **PlayerAnalyzerTest**

`PlayerAnalyzerTest` contains a series of test cases aimed to verify the correct functioning of the `PlayerAnalyzer` class. It simulates various player scenarios: from junior, normal, to senior players. Additionally, it tests edge cases such as when skills are set to null or when provided with an empty player array. Through these tests, we ensure the reliability and robustness of the `PlayerAnalyzer` class, especially its ability to calculate scores based on a player's age, experience, and skills.

## **StudentConverterTest**

`StudentConverterTest` ensures that the `StudentConverter` class works accurately in converting and evaluating student data. This class tests various student scenarios like high achievers, students who've just passed, or those who've failed. Furthermore, it checks edge cases such as when the input list is empty or set to null. The primary focus of these tests is to ensure that the conversion mechanism works correctly, identifying whether a student is an honor roll, exceptional, or if they've passed or failed based on their grades.

# Running Tests Locally Using Gradle

### **Prerequisites**:

1. Ensure you have the Java Development Kit (JDK) installed.
2. Make sure you have Gradle properly set up in your project.

### **Steps**:

1. Navigate to the root directory of your project in your terminal or command prompt.
2. Run the command:
```bash
./gradlew test