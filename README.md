# 🧪 TestNG Practice Project

This project covers all core TestNG concepts with hands-on Java examples.

---

## 📁 Project Structure

```
TestNG-Practice/
├── src/
│   └── test/
│       └── java/
│           └── testNG/
│               ├── dataProvider/         # Data-driven testing examples
│               ├── listners/             # Custom TestNG listeners
│               ├── parallel/             # Parallel test execution
│               ├── parameter/            # Parameter passing examples
│               ├── AnnotationHierarchy.java   # Before/After annotation order
│               ├── AssertionTest.java         # Assertion methods
│               ├── DependOnMethod.java        # Test dependencies
│               ├── GroupTest.java             # Test grouping
│               ├── PriorityTest1.java         # Test priority control
│               └── TestNGAnnotation.java      # Core annotations demo
├── Grouptest.xml       # XML config for group execution
├── Listeners.xml       # XML config for listeners
├── Parameter.xml       # XML config for parameters
├── TestSuite.xml       # Test suite configuration
├── testng.xml          # Main TestNG configuration
├── pom.xml             # Maven dependencies
└── test-output/        # Auto-generated TestNG reports
```

---

## 📚 Concepts Covered

| Concept | File / Folder |
|---|---|
| TestNG Annotations | `TestNGAnnotation.java` |
| Annotation Hierarchy (Before/After) | `AnnotationHierarchy.java` |
| Test Priority | `PriorityTest1.java` |
| Test Groups | `GroupTest.java`, `Grouptest.xml` |
| Depend On Method | `DependOnMethod.java` |
| Assertions | `AssertionTest.java` |
| Parameters | `parameter/`, `Parameter.xml` |
| Data Provider | `dataProvider/` |
| Parallel Execution | `parallel/` |
| Listeners | `listners/`, `Listeners.xml` |
| Test Suite Setup | `TestSuite.xml`, `testng.xml` |
| Maven Integration | `pom.xml` |

---

## ⚙️ Tech Stack

- **Language:** Java
- **Testing Framework:** TestNG
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above
- Maven installed
- IntelliJ IDEA

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/Kavinash-Chamuditha/TestNG-Practice.git
   cd TestNG-Practice
   ```

2. **Install dependencies**
   ```bash
   mvn install
   ```

3. **Run all tests**
   ```bash
   mvn test
   ```

4. **Run a specific XML suite**
   ```bash
   mvn test -DsuiteXmlFile=testng.xml
   ```

5. **View Reports**
   Open `test-output/index.html` in your browser to see the TestNG HTML report.

---

## 🎯 Key Learnings

- Understanding the **TestNG annotation lifecycle** and execution order
- Using **testng.xml** to configure and organize test suites
- Running **parameterized tests** using `@Parameters` and `@DataProvider`
- Controlling test flow with **priority** and **dependencies**
- Executing tests **in parallel** to reduce runtime
- Writing **custom listeners** for logging and screenshot capture on failure
- Generating and reading **TestNG HTML reports**

---


