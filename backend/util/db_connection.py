from dotenv import dotenv_values
from psycopg_pool import ConnectionPool

config = dotenv_values(".env")

pool = ConnectionPool(
    'postgresql://' +
    config['db_user'] + ':'
    + config['db_password'] + '@' +
    config['host'] + ':' +
    config['port'] + '/' +
    config['db_name']
)
