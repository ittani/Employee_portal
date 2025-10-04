# 🧑‍💼 Employee Portal

A simple Java-based console application for managing employee profiles at **Noventa Group**.  
This project demonstrates key programming concepts such as object-oriented design, input validation, and class collaboration.

---

## 🚀 Features

- ✅ Validate existing employees using pre-registered work numbers.
- 🆕 Create new employee profiles if the work number does not exist.
- 🧠 Auto-generate a 4-digit work number for new employees.
- 💾 Display employee information in a readable format.
- ⚙️ Modular design using multiple classes:
    - `ValidateEmployee` – validates existing employees.
    - `CreateEmployee` – creates new employee profiles.
    - `EmployeeInfo` – stores and displays employee data.
    - `Main` – entry point of the program.

---

## 📂 Project Structure
Employee Portal/
├── src/
│   ├── EmployeeInformation/
│   │   ├── ValidateEmployee.java
│   │   ├── CreateEmployee.java
│   │   ├── EmployeeInfo.java
│   │   └── DisplayNewEmployeeInfo.java (optional)
│   ├── System/
│   │   └── SystemCheck.java
│   └── Main.java
├── .gitignore
└── README.md

---

## 🧰 How to Run

### **1. Clone the repository**
```bash
git clone https://github.com/ittani/Employee_portal.git