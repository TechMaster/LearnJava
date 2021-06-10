# Nội dung học buổi hôm nay

- Mô phỏng nhiều lớp học. Trong đó mỗi lớp học gồm có:
  - Sinh viên
  - Các môn học: toán, lý, hoá, văn, sinh, sử, địa, âm nhạc, thể thao
  - Giảng viên: có thể dạy một vài môn cho vài lớp
  - Điểm số của sinh viên: 0-10

Spring Boot là framework chuyên để lập trình Web Back End.

Node.js viết bằng JavaScript
Golang có rất nhiều web framework
Java có Spring Boot, Quarkus <-- Java Spring Boot
C# có ASP.net Core
PHP có Laravel, ....

Lớp học được 9 buổi.

Bản chất của buổi hôm nay để các bạn rèn luyện kỹ năng phân tích nghiệp vụ, chuyển hoá sang cấu trúc các Class --> Entity --> Table trong CSDL.


Phân biệt giữa các đối tượng
Mỗi một đối tượng cần có một thuộc tính có tính chất duy nhất trong một phạm vi. 

Số chứng minh nhân dân duy nhất trong phạm vi nào? quốc gia
Họ và tên đầy đủ duy nhất trong phạm vi gì?
Email có tính duy nhất trong phạm vi Internet
Tên công ty có tính duy nhất ?
Khi đi thi đại học có số báo danh. Số báo danh ánh xạ một sinh viên cụ thể vào một dãy số.
Khi kiểm tra trong lớp không cần số báo danh.
Còn khi thi đại học, bắt buộc mỗi sinh viên phải có số báo danh duy nhất? 

+ Nhiều người đi thi có thể trùng tên nhau.
+ Chống gian lận.

Liên quan đến Unique Key (khoá duy nhất). Mỗi đối tượng bên cạnh các thuộc tính vốn có khi chúng ta mô phỏng trong phần mềm máy tính, cần phải bổ xung một Unique Key để dễ dàng tìm ra đối tượng một cách chính xác nhất.

Trong cơ sở dữ liệu quan hệ thì người ta gọi là Primary Key (khoá chính) có vài tính chất: 
- Duy nhất
- Không được null
- Dễ dàng tìm kiếm


Trong một trường cấp 3 có 3 cấp độ lớp:
1. Lớp 10: 10A, 10B, 10C, 10D, 10E, 10F
2. Lớp 11: 11A, 11B, 11C, 11D, 11E, 11F
3. Lớp 12: 12A, 12B, 12C, 12D, 12E, 12F

Thành phô - Trường  - Niên khoá  - Lớp     -> primary key
Hà nội  - Amsterdam - 2019->2022 - Lớp 10A -> id: 1
Hà nội  - Việt Đức  - 2019->2022 - Lớp 10A -> id: 2
Sài gòn - Amsterdam - 2019->2022 - Lớp 10A -> id: 3
Sài gòn - Việt Đức  - 2019->2022 - Lớp 10A -> id: 4

Tìm ra một key duy nhất để xác định đối tượng cho thầy nào

Khi nào dùng public và khi nào dùng private, protected, package:

Nếu chúng ta để access modifier là public thì bất kỳ đối tượng nào khác cũng có thể xem, hoặc thay đổi giá trị.

Ngược lại nếu chúng ta để access modifer là private thì chỉ có phương thức của chính đối tượng đó mới xem và thay đổi được.

Phát sinh ra 2 loại phương thức đó là:
1. Getter method: để đọc dữ liệu từ private property
2. Setter method: để ghi dữ liệu vào private property

Trong VSCode để tạo Getter và Setter method, chúng ta làm như sau:

- Chuột phải -> Source Action...-> Generate Getter and Setter

Tác dụng của Getter và Setter method:
- Nó cần phải kết hợp Aspect Programming
- Có thể bổ xung logic vào Getter và Setter method