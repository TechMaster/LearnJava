# Lập trình MySQL

## Thực hành

1. [Thực hành căn bản với một bảng](01.md)
2. [Thực hành lệnh SELECT](02.md)
  
## Hỏi đáp

Hỏi: Là một lập trình viên kiểm thử tự động, tại sao tôi cần phải học MySQL?
Đáp: MySQL là CSDL quan hệ rất phổ biến. OneMount, Viettel, Tiki, OpenCommerce đang sử dụng MySQL trong các sản phẩm, dịch vụ quan trọng của mình.

Kỹ năng lập trình, quản trị, tối ưu MySQL rất rộng và đa dạng. Ở vai trò kiểm thử viên, các bạn hãy tập trung nắm các câu lệnh Data Manipulation Language (chỉnh sửa dữ liệu) đặc biệt là truy vấn dữ liệu.


---

Hỏi: Trong Java làm thế nào để thao tác lên CSDL MySQL?

Đáp: Java có nhiều thư viện để thao tác lên MySQL:
- API cấp thấp: JDBC
- ORM giúp việc lập trình hướng đối tượng với CSDL quan hệ dễ dàng hơn thì có: Hibernate, JPA, JOOQ


---

Hỏi: CRUD là gì?

Đáp: Create - Read - Update - Delete?

---
Hỏi: Cài MySQL trên máy tính như thế nào?

Đáp: Tuỳ thuộc vào hệ điều hành bạn đang sử dụng. Có 3 cách chính:
1. Tải file binary về rồi cài trực tiếp trên hệ điều hành
2. Cài đặt Docker, sau đó chạy lệnh Docker run
```
docker run --name container_name -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:latest
```
3. Cài [XAMPP](https://www.apachefriends.org/index.html)

---
Hỏi: ORM là gì?

Đáp: ORM là Object Relational Mapping một kỹ thuật để lập trình CSDL mà không viết câu lệnh SQL quá nhiều thay vào đó sử dụng OOP và các cấu trúc dữ liệu tương đương trong ngôn ngữ lập trình.

---
Hỏi: DDL khác gì với DML?

Đáp: DDL là Data Definition Language. Còn DML là Data Manipulation Language.
DDL ví dụ lệnh `CREATE TABLE products`

DML ví dụ lệnh `INSERT INTO products (name, price) VALUES ('nike shoes', 20000)`