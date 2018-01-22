###################################################
Build Kotlin bằng Command Line với Kotlin compiler
###################################################

* Thực hiện: Thi Minh Nhựt - Email: `thiminhnhut\@gmail.com <thiminhnhut@gmail.com>`_

* Thời gian: Ngày 23 tháng 01 năm 2018

.. contents:: **Nội dung**

.. sectnum::

Nguồn tham khảo
****************

1. `Working with the Command Line Compiler <https://kotlinlang.org/docs/tutorials/command-line.html>`_

Nội dung thực hiện
*******************

Compile the application
========================

  .. code-block:: bash

    $ kotlinc hello.kt -include-runtime -d hello.jar

    $ java -jar hello.jar

Compiling a library
====================

  .. code-block:: bash

    $ kotlinc hello.kt -d hello.jar
