INSERT 0 1
                                          Таблица "public.jaegers"
  Столбец  |       Тип        | Правило сортировки | Допустимость NULL |            По умолчанию             
-----------+------------------+--------------------+-------------------+-------------------------------------
 id        | integer          |                    | not null          | nextval('jaegers_id_seq'::regclass)
 modelname | text             |                    |                   | 
 mark      | integer          |                    |                   | 
 height    | double precision |                    |                   | 
 weight    | double precision |                    |                   | 
 status    | text             |                    |                   | 
 origin    | text             |                    |                   | 
 launch    | integer          |                    |                   | 
 kaijukill | integer          |                    |                   | 
Индексы:
    "jaegers_pkey" PRIMARY KEY, btree (id)

                    Список отношений
 Схема  |      Имя       |        Тип         | Владелец 
--------+----------------+--------------------+----------
 public | jaegers        | таблица            | postgres
 public | jaegers_id_seq | последовательность | postgres
(2 строки)

                                          Список баз данных
    Имя    | Владелец | Кодировка |     LC_COLLATE      |      LC_CTYPE       |     Права доступа     
-----------+----------+-----------+---------------------+---------------------+-----------------------
 jaegers   | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 postgres  | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 template0 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
 template1 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
(4 строки)

                                          Список баз данных
    Имя    | Владелец | Кодировка |     LC_COLLATE      |      LC_CTYPE       |     Права доступа     
-----------+----------+-----------+---------------------+---------------------+-----------------------
 jaegers   | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 postgres  | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 template0 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
 template1 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
(4 строки)

