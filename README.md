# KotlinLessons
this is the place where i show my progress in lerning aned using kotlin
 Lesson one

## Задание №1 “Знакомство с Kotlin Playground”.
Kotlin Playground
https://play.kotlinlang.org/
Написать простую программу, которая принимает в
качестве аргументов два целых числа и выводит на экран их
сумму. Всю программу можно написать внутри функции
main.

Семинар 1. Введение в Kotlin
Выполните задание самостоятельно и пришлите свой ответ в чат.

## Задание №2 “Дописать функции”
Семинар 1. Введение в Kotlin
1. Создать новый проект в IntelliJ IDEA.
2. Скопировать в новый .kt файл код функции main.
```
   fun main() {
      println("sumAll = ${sumAll(1, 5, 20)}")
      println("sumAll = ${sumAll()}")
      println("sumAll = ${sumAll(2, 3, 4, 5, 6, 7)}")
      println(createOutputString("Alice"))
      println(createOutputString("Bob", 23))
      println(createOutputString(isStudent = true, name = "Carol", age = 19))
      println(createOutputString("Daniel", 32, isStudent = null))
      println(multiplyBy(null, 4))
      println(multiplyBy(3, 4))
   }
```
   Задание №2 “Дописать функции”
   Семинар 1. Введение в Kotlin
   3.Реализовать функции sumAll, createOutputString и multiplyBy
   так, чтобы программа выводила следующие строчки.

*   sumAll = 26
*   sumAll = 0
*   sumAll = 27
*   Alice has age of 42
*   Bob has age of 23
*   student Carol has age of 19
*   Daniel has age of 32
*   null
*   12

   ## Задание №2 “Дописать функции”
   Описание функций:
 * sumAll принимает переменное число аргументов типа Int. Возвращает сумму
   всех чисел, либо 0, если не передан ни один аргумент.
 * createOutputString формирует строку, используя параметры name, age и
   isStudent. У параметров age и isStudent есть значения по умолчанию.
 * multiplyBy принимает два числа типа Int и возвращает их произведение.
   Вместо первого числа, можно передать null, в этом случае функция должна
   вернуть null.
 
Семинар 1. Введение в Kotlin
   Задание №3 “Циклы”

   a – количество звёздочек на первой строчке;

   b – количество строк от первой до центральной и от
   центральной до последней;

   c – количество звёздочек, на которое увеличивается
   последовательность с каждой строкой.

   Семинар 1. Введение в Kotlin
   Написать программу, выводящую на экран фигуру из звёздочек.

   ## Задание №3 “Циклы”
   Семинар 1. Введение в Kotlin
   
a=5, b=2, c=2
 
a=1, b=3, c=2

a=1, b=2, c=4