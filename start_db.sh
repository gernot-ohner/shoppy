docker run --name shoppydb \
  -p 5432:5432 \
  -e POSTGRES_PASSWORD=mysecretpassword \
  -e POSTGRES_DB=shoppydb \
  -v pgdata:/var/lib/postgresql/data \
  postgres