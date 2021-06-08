# Ví dụ về 4 tính chất trong lập trình hướng đối tượng.

1. Encapsulation: đóng gói
2. Abstraction: trừu tượng
3. Inheritance: kế thừa
4. Polymorphism: đa hình

## 1. Encapsulation - Đóng gói

Tại sao phải đóng gói? và đóng gói cái gì?
Đóng gói để che dấu những biến, những phương thức nội bộ. Việc này cũng giống trong tự nhiên, mỗi đối tượng đều có những thuộc tính, hành vi không nên công khai.

Ví dụ Bắc Triều Tiên luôn công khai 2 hành động đó là hoạt động xếp hình biển người và phóng thử tên lửa. Tuy nhiên để đổi lấy viện trợ lương thực, Bắc Triều Tiên phải che dấu thật kỹ chương trình làm giàu chất Plutonium ```private void enrichPlutonium()```

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

Ví dụ khác: một bà mẹ đơn thân có một người con. Người con này học rất giỏi. Do đó bà mẹ này luôn chia sẻ lên mạng xã hội thành tích học tập của con. Đây là ví dụ của ```public```

Bà mẹ này gửi tích kiệm 500 triệu VND để dành cho người con chuẩn bị đi Mỹ du học. Bà hoàn toàn không nói cho ai, ngoài con và người thân trong gia đình. Vậy đây là ví dụ của ```protected```

Bà mẹ này không bao giờ nói cho con và bất kỳ ai biết bố đẻ thực sự là ai. Vậy đây là ví dụ của ```private```

Mặc định Java còn có giới hạn truy cập mức độ ```package```. Trong một công ty mọi người biết mã số mở cửa tự động. Người ngoài công ty không thể biết. Mã số mở cửa tự động cũng chả của riêng ai.

*Nếu không có đóng gói, encapsulation thì điều gì xảy ra?*
trong đời thường không có đóng gói, bạn đi mua hàng, bạn sẽ dùng tay, chứ không dùng túi để chứa đồ. Về nhà, mọi đồ đạc trong phòng sẽ để bừa bộn mà không có tủ lưu.

## 1.1 Đóng gói còn thể hiện ở Composition !

Khi chúng ta mổ xẻ một chiếc xe máy ra, sẽ thấy rất nhiều bộ phận đến từ các nhà sản xuất khác nhau. Nhưng bộ phận này cần được thiết kế để khi hỏng thì sẽ ảnh hưởng ít nhất đến các bộ phận khác, và dễ dàng thay thế.
Bộ phận đề nổ tự động khi hỏng có thể thay thế mà không phải thay thế cả động cơ. Hay RAM, card màn hình có thể thay thế mới, bởi chúng có tính đóng gói và tuân thủ quy chuẩn (interface).

Một xe máy hay một máy tính bao gồm (composition) nhiều bộ phận. Mỗi bộ phận này có tính đóng gói (encapsulation) và tuân thủ quy chuẩn (implement interface). Chính điều này sẽ khiến những người mới học lập trình sẽ thấy các tính chất trong OOP có gì đó rất mơ hồ, nhập nhằng. Thực tế là chúng liên quan chặt chẽ đến nhau. Nếu bạn chưa thực sự hiểu lập trình hướng đối tượng.

## 2. Abstraction : trừu tượng
Trừu tượng đi cùng tính khai quát. Ví dụ những người châu Á có mắt đen, da vàng. Người Nhật chăm chỉ. Trong lập trình, cần sự trừu tượng và khai quát để định hình ra các kiểu dữ liệu. 
- Để mô tả các khách hàng mở tài khoản ngân hàng, cần có những thuộc tính (property) và phương thức (method) gì là chung nhất? 
- Trong một games mô phỏng các loài vật trong một khu rừng, để người chơi ấn vào đó, con vật phát ra âm thanh và di chuyển. Cần có những thuộc tính (property) và phương thức (method) để mô phỏng?
- Để mô tả các bộ phim đang chiếu, sắp chiếu ở một rạp sẽ đưa lên một web site cho phép người dùng đặt vé, giữ chỗ, thanh toán, cần có thuộc tính, phương thức gì và cần bỏ qua thuộc tính gì.

Thiết kế abstraction sẽ bỏ đi nhưng thuộc tính, phương thức tiểu tiết, không thực sự hữu ích mà đúc kết ra những thuộc tính chung nhất, khái quát nhất, hữu ích nhất phục vụ cho phần mềm.

Trong Java có 2 cơ chế để thực hiện Abstraction:

- Tạo một base class để khai quát thuộc tính, phương thức cho các class khác kế thừa. Base class có thể concrete class (class thật sự) hoặc abstract class (class trừu tượng). Class thật sự có thể dùng để tạo ra object (đối tượng). Còn Class trừu tượng (abstract class) thì không thể tạo ra đối tượng. Nó chỉ dùng để làm mẫu tạo ra class khác có thể là concrete class hay abstract class.

- Tạo ra một interface để khai quát mẫu phương thức. Một class hay interface có thể tuân thủ (implements) nhiều interface.

Như vậy có thể thấy abstraction (trừu tượng) luôn đi cùng với inheritance (kế thừa). Phải có trừu tượng thì mới có kế thừa. Cầu thủ ra sân, phải có bóng. Bình nước dùng để đựng nước.

