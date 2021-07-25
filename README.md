# Gradle の不具合の調査

```bash
./gradlew run
lsof -i :3000 # これでプロセスが何もヒットしないべきだが、実際には node プロセスがヒットする
```
