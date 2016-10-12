# testjar1
1. Запустите Intelij Idea.

2. Создайте новый проект Maven.

3. Напишите название GroupId,ArtifactId и Project name.

4. Перейдите в src\main\java создайте каталог, в который скопируйте test.java.

5. Перенесите текст из pom.xml в свой и замените там GroupId и ArtifactId, на те которые вы использовали.

6. Откройте Maven Project, разверните Lifecycle, там выберите clean, package и запусте Run Maven Build. 

7. Исполняемый jar файл готов к использованию.

8. Через командную строку зайдите в каталог с jar файлом и пропишите команду java -jar <имя файла>
