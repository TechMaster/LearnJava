Buổi trước học:

1- Giới thiệu về Java Collection với các thao tác:

- Duyệt stream
- Lọc filter
- Nhóm Group By
- Sau khi Group By xong thì làm:
   + Min
   + Max
   + Count
   + Sum
   + Average

- List: ArrayList
- Set:
- Map: 

2- Cách tạo một project Spring Boot
+ Sử dụng starter.spring.io hoặc trong 
  Intellij Ultimate > New Project ... > Spring Initializr

+ VS Code > View > Command Pallette ...> Spring Initializr

+ Maven có pom.xml
+ Bổ xung dependencies (thư viện) bằng lên Maven Repository để tìm

----------
# Nội dung buổi học hôm nay


## Sử dụng Lombok

```java
package vn.techmaster.dataanalysis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Sinh ra Getter, Setter, và phương thức toString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String name;
  private String nationality;
  private int age;
}
```

## Giải thích Annotation trong Java

Bên cạnh các tính năng lập trình hướng đối tượng Class, Abstract, Interface, rồi kiểu tổng quát Generic Programming, rồi Lambda Expression. Java vẫn cần có một vũ khí để lập trình viên có thể chú thích cho Java Compiler và Java Runtime.

Chúng ta có comment code chỉ dành cho người trần mắt thịt (human read)

Tuy nhiên chúng ta muốn hơn thế, muốn nhắn nhủ Java Compiler (biên dịch - javac) và Java Run time (java) làm một số việc lặp đi lặp lại, mà chúng ta lại không muốn viết code dài dòng.


Khi chúng ta viết `@Data` thì ở lúc biên dịch, Java sẽ kết hợp với Lombok plugin để sinh ra getter và setter method rồi chèn code vào cùng những đoạn code do chúng ta viết. Bản chất là chúng ta dùng annotation chỉ đạo cho máy tự code những đoạn lặp đi lặp lại.

`@AllArgsConstructor` ý là: java ơi, mày viết giúp anh/chị phương thức constructor !

`@Repository` ý là: java ơi, chị đánh dấu để mày biết đây là class chuyên để xử lý, truy vấn dữ liệu. Mày lưu ý giúp chị, có lúc cần thì mang ra ngay cho chị.


`@Autowired` dùng ở lúc runtime, yêu cầu SpringBoot hãy tìm một đối tượng có kiểu phù hợp gán vào biến này


Hỏi: sự khác nhau khi trả về một biến dưới kiểu Interface khác gì với trả về một biến kiểu Concrete Class?

Đáp: trả về biến kiểu Interface có tính trừu tượng cao hơn, chỉ quan tâm đến hành vi (method)

Dưới interface Map chúng ta có rất nhiều biến thể dạng Concrete Class

## Tác dụng thực tế của JUnit 

Khi chúng ta đang code một đoạn code nhưng nó bị lỗi rất khó debug.
Chúng ta có thể chuyển sang dùng Junit để debug từng phần nhỏ của code.


