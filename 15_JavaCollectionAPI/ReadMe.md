Ôn lại về Java Collection Stream API

Hỏi: khi nào dùng .filter và khi nào dùng .collect?

Đáp: .filter tương đương với toán tử WHERE trong câu lệnh SELECT. Còn .collect không tương đương với toán tử hay câu lệnh nào trong SQL. .collect dùng để nhặt từng phần tử sau đó biến đổi chúng thành cấu trúc dữ liệu mà lập trình viên muốn.

Thường thì .filter trước rồi mới .collect tuy nhiên sau khi .collect nếu kiểu dữ liệu trả về là List và Set thì chúng ta vẫn có thể tiếp tục .filter

---

Hỏi: .stream được dùng đối với kiểu dữ liệu nào?

Đáp: .stream dùng được với với kiểu List và Set còn kiểu Map thì không được. Muốn duyệt các phần tử trong Map, chúng ta phải thực hiện trên tập Map.EntrySet `Set<Map.Entry<K, V>> entrySet();`

---

Hỏi: Làm sao để lập trình Java Collection Stream thành thạo?

Đáp: Cần nắm rõ sự khác biệt về bản chất giữa List, Set, Map. Các câu lệnh SQL đều có hàm tương tự trong Java Collection Stream. Chuẩn bị sẵn một bộ ví dụ làm tham chiếu. Khi nào quên mở ra xem lại.

Khi viết các lệnh nối tiếp nhau thì nên xuống dòng để cho dễ đọc. Khi cần hãy ngắt ra rồi gán vào một biến để quan sát trong debugger.


---

Bây giờ học MySQL được chưa các bạn?


CASE 
WHEN age < 18 THEN 'Thiếu niên' 
WHEN age < 35 THEN 'Thanh niên' 
WHEN age < 50 THEN 'Trung niên' 
ELSE 'Cao tuổi' 
END AS agelevel

---



