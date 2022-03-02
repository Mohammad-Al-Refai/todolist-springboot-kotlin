

CREATE TABLE IF NOT EXISTS users(
id uuid not null primary key DEFAULT uuid_in(md5(random()::text || clock_timestamp()::text)::cstring),
userName varchar(255) not null,
created_at TIMESTAMP
);


CREATE TABLE IF NOT EXISTS todo(
id uuid not null primary key DEFAULT uuid_in(md5(random()::text || clock_timestamp()::text)::cstring),
title varchar(255) not null,
userId uuid  not null  ,
description varchar(255) not null,
created_at TIMESTAMP
);

