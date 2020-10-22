@echo off
docker build -t alura/forum .

docker run -p 8080:8080 -e FORUM_DATABASE_URL='' -e FORUM_DATABASE_USERNAME='sa' -e FORUM_DATABASE_PASSWORD='' -e FORUM_JWT_TOKEN='r@nd0m_t0&3n_h3r3' alura/forum

