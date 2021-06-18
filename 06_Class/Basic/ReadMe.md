# Căn bản về Class

## Khai báo một class
```java
public class Person {
  String firstName;
  String lastName;
  LocalDate birthday;
  public void sayHi() {
    System.out.println("Hi , I am " + this.firstName + this.lastName);
  }
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
  person.sayHi();
}
```
Hỏi: Trong một class, thuộc tính khác phương thức như thế nào?
Đáp: Thuộc tính của một class chỉ tính chất chung mà các đối tượng được tạo ra từ class đều phải có. Còn phương thức là hành vi, hành động của đối tượng

---

Hỏi: phương thức (method) khác với hàm (function) như thế nào?
Đáp: phương thức luôn gắn với một class. Nếu là static method, thì chúng ta chạy bằng `class.staticMethod()`. Nếu là non static method, thì chạy bằng `object.nonStaticMethod()`

Hàm (function) thường không gắn vào một class/object cụ thể. Thế nên người ta hay dùng lambda function (hàm được khai báo trực tiếp tại lúc dùng), chứ ít ai dùng lambda method.

Nếu thỉnh thoảng bạn có nhầm lẫn giữa function và method cũng chả sao. Quan trọng là code đừng lỗi là được.
---

Hỏi: tại sao lập trình hướng đối tượng (OOP) lại phức tạp đến vậy? Có cách nào đơn giản hơn không?
Đáp: Xung quanh ta đều là đối tượng. Khi khái quát hoá lên, chúng ta sẽ có các class tập hợp các đối tượng cùng chung các đặc điểm và hành vi lại. Lập trình hướng đối tượng dễ khi các bạn luôn liên hệ với đời thường.

---

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

---

## Access Modifier

Hỏi: khi khai báo `class Vector` như sau:
```java
public class Vector {
  float x;
  float y;
}
```
sau đó viết code
```java
static void demoVector() {
  Vector vector = new Vector();
  vector.x = 10;
  vector.y = 11;
}
```
Lúc biên dịch, lỗi như sau
```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The field Vector.x is not visible
        The field Vector.y is not visible
```

Trả lời: trong class có các từ khoá gọi access modifier. Chúng là `private, protected, public` chúng dùng để xác định quyền truy cập vào thuộc tính và phương thức bên trong một class. Có một access modifier mặc định không có keyword cụ thể, người ta gọi là package access modifier. Chỉ những class nằm trong cùng một package mới có thể truy xuất được các thuộc tính, phương thức của nhau.


Trong App.java, lệnh này báo lỗi khi biên dịch, vì [App.java](App.java) không cùng package với [Vector.java](Math/Vector.java)
```java
Vector vector = new Vector();
vector.x = 10;
vector.y = 11;
```
Nhưng trong [DemoVector.java](Math/DemoVector.java) thì không báo lỗi vì `DemoVector` cùng package với [Vector.java](Math/Vector.java)

### public vs private. Tại sao cần phải che dấu thuộc tính - phương thức?

Hỏi: `public` là công khai thì rõ rồi. Tại sao phải dùng đến `private`? 
Đáp: Hãy nhìn vào ví dụ `class NorthKorea` bạn sẽ thấy có những hoạt động mà Bắc Triều Tiên cần phải giấu thật kỹ, chỉ nội bộ biết, vậy phải dùng đến `private`

```java
public class NorthKorea {
  private void enrichPlutonium() {
    System.out.println("No one should know about this. So it must be private");
  }

  public void runPanoramaShow() {
    System.out.println("It is beautiful so every one should know");
  }

  public void demoNuclearMissile() {
    System.out.println("To threaten South Korea and US");
  }
}
```

### protected dùng khi nào?

Hỏi: `protected` dùng khi nào?
Đáp: `protected` chỉ cho phép các class kế thừa xem được thuộc tính, phương thức của mình. Ví dụ cụ thể: một ông chủ rất giàu, làm ở một công ty có nhiều nhân viên.

- Ông ta có một người con riêng. Ông ta muốn giữ kín chuyện này với bất kỳ ai. Dùng `private`
- Mật khẩu mở cửa công ty, chỉ chia sẻ với nhân viên cùng công ty. Dùng defaul access modifier
- Thành tích tốt của công ty, cần công bố rộng rãi `public`
- Số tiền tích kiệm 1 triệu USD chỉ nói riêng cho con cái của ông ta `protected`

## Constructor 

Constructor là một phương thức đặc biệt của class dùng để khởi tạo nên đối tượng từ class đó.
Constructor có thể nhận 0 hoặc nhiều tham số, và không có kiểu trả về.

```java
public Person(String firstName, String lastName, LocalDate birthday) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.birthday = birthday;
}
```
```java
Person johnHopkin = new Person("John", "Hopkin", LocalDate.of(1865, 05, 20));
```
## Java có Destructor không?

Java không thực sự có Destructor nhưng nó có ghi đè phương thức finalize nếu class kế thừa từ `class Object`

