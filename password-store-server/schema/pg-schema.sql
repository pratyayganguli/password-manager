
SELECT 'CREATE DATABASE passwordstore' WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'passwordstore')\gexec

CREATE TABLE IF NOT EXISTS application(
    application_id TEXT NOT NULL,
    application_name TEXT NOT NULL,
    application_health BOOLEAN NOT NULL,
    PRIMARY KEY (application_id)
);
