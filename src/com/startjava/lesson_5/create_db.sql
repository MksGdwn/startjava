INSERT 0 1
                                          ������� "public.jaegers"
  �������  |       ���        | ������� ���������� | ������������ NULL |            �� ���������             
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
�������:
    "jaegers_pkey" PRIMARY KEY, btree (id)

                    ������ ���������
 �����  |      ���       |        ���         | �������� 
--------+----------------+--------------------+----------
 public | jaegers        | �������            | postgres
 public | jaegers_id_seq | ������������������ | postgres
(2 ������)

                                          ������ ��� ������
    ���    | �������� | ��������� |     LC_COLLATE      |      LC_CTYPE       |     ����� �������     
-----------+----------+-----------+---------------------+---------------------+-----------------------
 jaegers   | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 postgres  | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 template0 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
 template1 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
(4 ������)

                                          ������ ��� ������
    ���    | �������� | ��������� |     LC_COLLATE      |      LC_CTYPE       |     ����� �������     
-----------+----------+-----------+---------------------+---------------------+-----------------------
 jaegers   | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 postgres  | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | 
 template0 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
 template1 | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 | =c/postgres          +
           |          |           |                     |                     | postgres=CTc/postgres
(4 ������)

