create table MENU (
	menu_no	bigint	NOT NULL primary key COMMENT '시퀀스 - autoIncrement',
	menu_p_no	bigint	NOT NULL	COMMENT '부모번호',
	menu_name	varchar(50)	NULL	COMMENT '메뉴명',
	menu_order	bigint	NULL	DEFAULT 1	COMMENT '표현할 메뉴 순서',
	menu_at	boolean	NULL	DEFAULT true	COMMENT '메뉴 사용여부',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간'
);

CREATE TABLE CODE (
	code_no	bigint	NOT NULL primary key 	COMMENT '시퀀스 - autoIncrement',
	code_name	varchar(6)	NULL	COMMENT '코드명 - 대분류+중분류+소분류가 합쳐진 코드',
	code_val1	varchar(2)	NULL	COMMENT '가장 큰 분류(ex. BD(게시판), RP(댓글), NT(릴리즈))',
	code_val2	varchar(2)	NULL	COMMENT '대분류 내 중분류(ex. BD인경우 01(일반) 02(공지) 03(투표))',
	code_val3	varchar(2)	NULL	COMMENT '중분류 내 소분류(ex. BD03인경우 01(단일) 02(다중))',
	code_at	boolean	NULL	DEFAULT true	COMMENT '사용여부',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간',
	code_memo	varchar(100)	NULL	COMMENT '코드 설명(언제 사용하는지)'
);

CREATE TABLE NOTE (
	note_no	bigint	NOT NULL primary key 	COMMENT '시퀀스 - autoIncrement',
	menu_no	bigint	NOT NULL	COMMENT '현재 메뉴 시퀀스',
	note_ver	varchar(20)	NULL	COMMENT '버전',
	note_cont	varchar(2000)	NULL	COMMENT '버전에서 변경된 사항',
	release_file_path	varchar(100)	NULL	COMMENT '릴리즈버전 경로',
	release_file_down_cnt	bigint	NULL	COMMENT '릴리즈버전 다운수',
	beta_file_path	varchar(100)	NULL	COMMENT '베타버전 경로',
	beta_file_down_cnt	bigint	NULL	COMMENT '베타버전 다운수',
	create_mng_no	bigint	NOT NULL	COMMENT '생성 관리자 시퀀스',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_mng_no	bigint	NOT NULL	COMMENT '수정 관리자 시퀀스',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간'
);

CREATE TABLE MANAGER (
	mng_no	bigint	NOT NULL primary key 	COMMENT '시퀀스 - autoIncrement',
	mng_name	varchar(20)	NOT NULL	COMMENT '관리자명 - 슬랙',
	mng_password	varchar(50)	NOT NULL	COMMENT '비밀번호 - 암호화 필요',
	mng_auth	varchar(50)	NULL	COMMENT '업로드 권한 여부 - 코드테이블에 명시',
	mng_at	boolean	NULL	DEFAULT true	COMMENT '사용여부',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간'
);

CREATE TABLE ATTACHMENT (
	file_no	bigint	NOT NULL	COMMENT '시퀀스 - autoIncrement',
	sub_no	bigint	NOT NULL	COMMENT '릴리즈노트, 익명게시판, 댓글에서 넘어오는 시퀀스번호',
	sub_type	varchar(6)	NOT NULL	COMMENT '릴리즈노트, 익명게시판, 댓글 등 위치 확인 위한 타입 - 코드테이블에 명시',
	file_path	varchar(100)	NOT NULL	COMMENT '파일경로',
	file_at	boolean	NULL	DEFAULT true	COMMENT '사용여부',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간'
);

CREATE TABLE BOARD (
	board_no	bigint	NOT NULL primary key 	COMMENT '시퀀스 - autoIncrement',
	menu_no	bigint	NOT NULL	COMMENT '현재 메뉴 시퀀스',
	board_title	varchar(50)	NOT NULL	COMMENT '타이틀',
	create_user	varchar(50)	NOT NULL	COMMENT '생성자명',
	board_password	varchar(50)	NOT NULL	COMMENT '비밀번호 - 암호화 필요',
	board_cont	varchar(2000)	NULL	COMMENT '게시판 내용',
	board_type	varchar(50)	NULL	COMMENT '일반, 공지, 투표 등 위한 타입 - 코드테이블에 명시',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간'
);

CREATE TABLE SUB_BOARD (
	sub_board_no	bigint	NOT NULL primary key 	COMMENT '시퀀스 - autoIncrement',
	board_no2	bigint	NOT NULL	COMMENT '현재 게시판 번호',
	sub_board_cont	varchar(2000)	NULL	COMMENT '댓글 내용',
	create_user	varchar(50)	NOT NULL	COMMENT '생성자명',
	sub_board_password	varchar(50)	NOT NULL	COMMENT '비밀번호 - 암호화 필요',
	create_dt	datetime	default current_timestamp()	COMMENT '생성시간',
	update_dt	datetime	default current_timestamp()	on update current_timestamp() COMMENT '수정시간'
);

