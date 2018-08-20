create table candidate_shreya(
CANDIDATEID number(20),
CANDFIRST_NAME varchar2(20),
CANDLAST_NAME varchar2(20),
CANDEMAIL_ID varchar2(20),
CANDPASSWORD varchar2(20),
CANDADDRESS varchar2(20),
primary key(CANDEMAIL_ID)
);


select * from candidate_shreya;

INSERT INTO candidate_shreya values(1,'ABCDEFG','ABCDEFG','abc@gmail.com','1234567','abc');