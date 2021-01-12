package com.example.demo.cmm.enm;

public enum Sql {
	CREATE_MANAGERS, CREATE_SUBJECTS, CREATE_STUDENTS, CREATE_TEACHERS,
	CREATE_GRADES, CREATE_ARTICLES, CREATE_REPLIES,
	TRUNCATE, COUNT, DROP;
	@Override
	public String toString() {
		String query = "";
		switch(this) {
		case CREATE_MANAGERS:
			query = "create table managers(\n" + 
					"   mgr_num int primary key auto_increment,\n" + 
					"   email varchar2(20),\n" + 
					"   password varchar2(20)\n" + 
					"   )"; break;
		case CREATE_SUBJECTS:
			query = "create table subjects \n" + 
					"(sub_num int primary key auto_increment, \n" + 
					"subject varchar(20), description varchar(100))"; break;
		case CREATE_STUDENTS:
			query = "create table students(\n" + 
					"   stu_num int primary key auto_increment,\n" + 
					"   userid varchar2(20),\n" + 
					"   password varchar2(20),\n" + 
					"   name varchar2(20),\n" + 
					"   ssn varchar2(20),\n" + 
					"   reg_date varchar2(20),\n" + 
					"   profile_image varchar2(100)\n" + 
					"   mgr_num int,\n" + 
					"   sub_num int,\n" + 
					"   constraint mgr_stu_fk foreign key(mgr_num) " +
					"					references managers(mgr_num)\n"+
					"	)"; break;
		case CREATE_TEACHERS:
			query = "create table teachers(\n" + 
					"   tea_num int primary key auto_increment,\n" + 
					"   name varchar2(20),\n" + 
					"   password varchar2(20),\n" + 
					"   subject varchar2(20),\n" + 
					"   profile_image varchar2(100)\n" + 
					"   sub_num int,\n" + 
					"   constraint sub_tea_fk foreign key(sub_num) " +
					"					references subjects(sub_num)\n"+
					"   )"; break;
		case CREATE_GRADES:
			query = "create table grades(\n" + 
					"   grade_num int primary key auto_increment,\n" + 
					"   subject varchar(20),\n" + 
					"   score varchar(20),\n" + 
					"   grade varchar(20),\n" + 
					"   stu_num int,\n" + 
					"   exam_date varchar(20)\n" + 
					"   )\n" + 
					"   constraint grades_fk foreign key(stu_num) " +
					"      references students(stu_num)" +
					"   constraint sub_tea_fk foreign key(sub_num) " +
					"					references subjects(sub_num)\n"+
					"   )"; break; 
		case CREATE_ARTICLES:
			query = "create table articles(\n" + 
					"   art_num int primary key auto_increment,\n" + 
					"   title varchar2(20),\n" + 
					"   content varchar2(20),\n" + 
					"   count varchar2(20),\n" + 
					"   writer_num int)"; break;
		case CREATE_REPLIES:
			query = "create table replies(\n" + 
					"  reply_num int primary key auto_increment,\n" + 
					"  content varchar2(20),\n" + 
					"  art_num int,\n" + 
					"  constraint replies_fk foreign key(art_num) references articles(art_num)\n" + 
					"  )"; break;
		case TRUNCATE:
			query = "truncate table "; break;
		case COUNT:
			query = "select count(*) count from"; break;
		case DROP:
			query = "drop table"; break;
		}
		return query;
	}
}