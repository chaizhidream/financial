/*创建数据库*/
drop database if exists financial ; 
create database financial;

/*进入对应数据库*/
use financial;

/*注册用户信息表*/
/*权限1，最高管理员，权限2，家庭用户管理员，权限3，普通用户*/
/*密码是数据库关键词，注意*/
/*性别，1代表男，0代表女*/
create table User(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
	ru int default 3,
	familyid int,
	telephone varchar(20),
	email varchar(100),
	sex int default 1,
	idcard varchar(40),
	role varchar(10),
    primary key(id)
);
/*支出信息表*/
create table OutInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	outcome double,
	outcometype varchar(16),
	outcomeuse varchar(16),
	members varchar(16),
	payouttime datetime,
	beneficiary varchar(50),
	information varchar(50),
	account varchar(16),
	primary key(id)
);
/*收入信息表*/
create table InInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	income double,
	incometype varchar(16),
	members varchar(16),
	incometime datetime,
	payer varchar(50),
	information varchar(50),
	account varchar(16),
    primary key(id)
);
/*账户表*/
create table UserAccount(
    id int not null auto_increment,
    username varchar(16) not null,
	cash double,
	bankcard double, 
	balance double,
	borrowing double,
	primary key(id)
);

/*银行卡信息表*/
create table BankCardInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	banknumber varchar(50),
	bankname varchar(16),
	primary key(id)
);

/*证券股票账户信息表*/
create table StockAccount(
    id int not null auto_increment,
    username varchar(16) not null,
	pwd varchar(16) not null,
	idcard varchar(40),
	telephone varchar(20),
	primary key(id)
);


/*证券股票信息表*/
create table StockInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	stockcode int,
	stockname varchar(16),
	totalnumber int,
	primary key(id)
);

/*证券股票流水信息表*/
create table StockFlow(
    id int not null auto_increment,
    username varchar(16) not null,
	stockcode int,
	stockname varchar(16),
	stocknumber int,
    BuyOrSell int,
	transactiontime datetime,
	transactionprince double,
	primary key(id)
);

/*修改密码时的验证信息表表*/
create table checkpwd(
    username varchar(16) not null,
	checkcode varchar(1000),
	primary key(username)
);


/*添加外键约束*/
/*alter table 表名 add foreign key(qId) references QUESTIONS(id); */



/*备份数据库*/
/*mysqldump -u root -p123456 financial-> C:\backup.sql*/


/*还原数据库*/
/*mysql -u root -p123456 < C:\backup.sql*/


/*开启MySQL的远程帐号-2）创建远程登陆用户并授权*/
/*如果想不限制链接的 IP 则设置为“%”即可。*/
/*grant all PRIVILEGES on 数据库名/数据表名 to root@'%'  identified by '123456';*/