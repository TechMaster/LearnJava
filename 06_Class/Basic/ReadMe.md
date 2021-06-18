# Căn bản về Class

## Khai báo một class
```java
public class Person {
  String firstName;
  String lastName;
  LocalDate birthday;
}
```
`class Person` nằm cùng package với `class App`

Trong class App viết một hàm `demoPerson()` như sau:
```java
static void demoPerson() {
  Person person = new Person();
  person.firstName = "John";
  person.lastName = "Mayer";
  person.birthday = LocalDate.of(1965, 11, 20);
  System.out.println(person);
}
```

Hỏi: tại sao `demoPerson()` phải khai báo với keyword `static`?
Đáp: trong một class, một static method chỉ có thể gọi đến static method chứ không thể gọi non static method. Ở đây hàm main là static, do đó muốn main gọi được demoPerson thì demoPerson cũng phải là static.

---
Hỏi: `static` khác gì với `non static` ?
Đáp: `static` dùng để chỉ phương thức hoặc thuộc tính luôn gắn với Class chứ không phải Object.

---

Hỏi: `class` khác gì với  `object`?

Đáp: `class` là khuôn mẫu để đúc ra `object`. Trong lập trình hướng đối tượng class là kiểu trừu tượng hoá các thuộc tính và phương thức chung. Từ class sẽ tạo ra object.

---
Hỏi: Ý nghĩa của `import Math.Vector;` là gì?
Đáp: Java tổ chức theo package. Bên trong một package có thể có nhiều file Java. Tên của package cũng trùng tên với thư mục. Ví dụ `class Vector` nằm trong `package Math` thì trong `class App` muốn dùng kiểu Vector sẽ phải khai báo

`import Math.Vector;`

