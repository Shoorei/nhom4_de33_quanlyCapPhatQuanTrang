# Quản lý Cấp Phát Quân Trang Tại Doanh Trại

## Tài khoản đăng nhập
- Email: superadmin@email.com  | Password: superadminpassword (Có quyền quản lý user)
- Email: thaoq6622@gmail.com   | Password: thaoq66622 (Không có quyền quản lý user)

## Mô tả dự án
Dự án "Quản lý cấp phát quân trang tại doanh trại" là một ứng dụng quản lý các hoạt động liên quan đến việc phân phối quân trang cho quân nhân tại các doanh trại quân đội. Hệ thống này cho phép người dùng quản lý thông tin cá nhân của quân nhân, quản lý các loại quân trang và theo dõi quá trình cấp phát, trả lại quân trang theo từng cấp bậc (cấp tướng, cấp tá, cấp uý).

## Công nghệ sử dụng
- **Ngôn ngữ lập trình**: Java
- **Quản lý gói và xây dựng dự án**: Maven
- **Cơ sở dữ liệu**: MySQL
- **Giao diện người dùng**: JavaFX hoặc Swing
- **IDE**: Apache NetBeans 23
- **Phiên bản JDK**: 23

## Cấu hình CSDL
- Tạo cơ sở dữ liệu MySQL có tên military_uniforms.
- Cập nhật thông tin cấu hình trong file src/main/resources/config.properties với thông tin user và password của bạn:

```
db.url=jdbc:mysql://localhost:3306/military_uniforms?useSSL=false
db.username=your_mysql_username   # Thay bằng username của bạn
db.password=your_mysql_password   # Thay bằng password của bạn
```

## Cấu trúc dự án
- `src/main/java`: Chứa mã nguồn chính của ứng dụng.
- `src/main/resources`: Chứa các tài nguyên như `config.properties` và file SQL `database_backup.sql`.
- `pom.xml`: File cấu hình của Maven, quản lý các thư viện phụ thuộc và plugin.

## Yêu cầu hệ thống
- **JDK**: Phiên bản 23
- **MySQL**: Để lưu trữ cơ sở dữ liệu
- **Maven**: Để quản lý dependencies



