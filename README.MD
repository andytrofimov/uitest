#Проект тестирования Яндекс.Переводчика
##Prerequisites:
* Установлен Chrome (или Firefox, но тогда надо в [BaseUiTest](../blob/master/src/main/java/ru/atrofimov/uitest/BaseUiTest.java) раскоментировать конфигурацию)
* JDK 1.8
* Имеется открытый доступ в интернет или настроена прокся, так как аллюр и селенид будут выгружать бинарники

##Запуск:
Команда `gradlew test allureReport ` запустит все тесты в параллели и сгененрит отчет