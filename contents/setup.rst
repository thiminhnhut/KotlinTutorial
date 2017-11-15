###############################################################################
Cài đặt môi trường lập trình Kotlin với Atom trên hệ điều hành Ubuntu 16.04.3
###############################################################################

* Thực hiện: Thi Minh Nhựt - Email: `thiminhnhut\@gmail.com <thiminhnhut@gmail.com >`_

* Thời gian: Ngày 15 tháng 11 năm 2017

Nguồn tham khảo
****************

1. `Kotlin Tutorial 1 — Introduction <https://medium.com/@napperley/kotlin-tutorial-1-introduction-675816f2443c>`_

2. `Kotlin Tutorial # 5 | Install Kotlin in Linux (Ubuntu) <https://www.youtube.com/watch?v=zK-Ph0d74vI>`_

3. `Working with the Command Line Compiler <https://kotlinlang.org/docs/tutorials/command-line.html>`_

Hướng dẫn cài đặt môi trường lập trình Kotlin trên hệ điều hành Ubuntu 16.04.3
*******************************************************************************

Cài đặt Kotlin compiler
========================

* Tải source của Kotlin: `GitHub Releases <https://github.com/JetBrains/kotlin/releases/tag/v1.1.60>`_

* Ví dụ được thư mục ``kotlin-compiler-1.1.60.zip`` giải nén thư mục ``kotlinc`` vừa tải về và di chuyển đến đường dẫn ``/usr/local/``:

  .. code-block:: bash

     $ sudo mv kotlinc /usr/local/

* Thêm đường dẫn vào biến môi trường trong file ``/etc/environment``

  .. code-block:: bash

      $ sudo nano /etc/environment

* Thêm đường dẫn ``/usr/local/kotlinc/bin/`` vào biến ``PATH``. Ví dụ: ``PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/usr/local/kotlinc/bin"``

* Cập nhật lại biến môi trường

  .. code-block:: bash

      $ source /etc/environment

Cài đặt package cho Atom
=========================

Vào ``Setting`` hoặc nhấn ``Ctrl + ,``: tìm và cài đặt các package sau: `language-kotlin <https://atom.io/packages/language-kotlin>`_, `linter <https://atom.io/packages/linter>`_, `linter-kotlin <https://atom.io/packages/linter-kotlin>`_, `script <https://atom.io/packages/script>`_
