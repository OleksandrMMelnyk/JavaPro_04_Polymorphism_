# JavaPro_04_Polymorphism
1. Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.  
   Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.  
   Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві;
2. Створіть тип даних Учасник та кілька його реалізацій: Людина, Кіт, Робот.  
   Класи з попереднього пункта повинні мати поведінку бігати і стрибати (методи просто виводять інформацію про дію в консоль);
3. Створіть тип даних Перешкода та кілька її реалізацій: Бігова Доріжка та Стіна.  
   Класи повинні мати поведінку подолати перешкоду (overcome);
4. Налагодити взаємодію між Учасником та Перешкодою.   
   Іншими словами, учасники під час проходження через перешкоди мають виконувати відповідні дії (бігти чи стрибати).  
   Наприклад: Людина пробігла бігову доріжку.
5. Створіть два масиви: з учасниками та перешкодами.   
   Кожен елемент з масиву з учасниками повинен пройти кожну перешкоду з масиву з перешкодами.
6. * У перешкод є довжина (для доріжки) або висота (для стіни), а учасників обмеження на біг та стрибки.   
   Якщо учасник не зміг пройти одну з перешкод, то наступного він не приступає (цілком вибуває з участі в серії перешкод). 
7. * Результат виконання учасником конкретної перешкоди виводити у консоль.  
   Наприклад: "Учасник[ІМ'Я] пройшов перешкоду[НАЗВА] на дистанції[ЗНАЧЕННЯ]"  
  "Учасник[ІМ'Я] не пройшов перешкоду[НАЗВА] на дистанції[ЗНАЧЕННЯ]. Пройдено[ЗНАЧЕНИЕ]"
