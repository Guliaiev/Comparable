# Comparable
## Интерфейсы для организации малой связности. Обобщенное программирование (Generics)
Поиск билетов
Легенда
Вы работаете в сервисе по продаже авиабилетов онлайн. Вот как это выглядит на https://aviasales.ru*:



Примечание*: если у вас не доступен по каким-то причинам сайт, вы можете воспользоваться сохранённой pdf-версией

**Что вам нужно сделать:**

Спроектируйте класс для информации о "Билете"*
Реализуйте репозиторий для хранения информации о "Билетах" (добавить, удалить, получить список)
Реализуйте менеджера поиска по аэропорту вылета и аэропорту прилёта (даты не учитывайте)
Примечание*: конечно же, сущность, которую вы видите на экране, - это не билет, а предложение. Попробуйте придумать ей более логичное имя.

Информация о "Билете"
Класс информации о билете - это data-класс, который должен содержать:

id
Стоимость (для упрощения будем считать стоимость единой для всех продавцов)
Аэропорт вылета (вы можете использовать IATA-коды)
Аэропорт прилёта (вы можете использовать IATA-коды)
Время в пути (в минутах)
Других данных не нужно.

Данный класс должен реализовывать интерфейс Comparable так, чтобы по умолчанию сортировка происходила по цене (самый дешёвый - самый первый).

Репозиторий
Репозиторий для хранения "билетов" ничем не отличается от тех репозиториев, что мы проходили раньше

Менеджер
В менеджере методов findAll должен претерпеть некоторые изменения: он должен принимать два параметра:

from - аэропорта вылета
to - аэропорт прилёта
Соответственно, в результате поиска возвращается массив только с теми билетами, что соответствуют условиям поиска.

Кроме того, результаты должны быть отсортированы по цене (от меньшей к большей).

Важно: выполняйте сортировку только после того, как вы выбрали из репозитория все подходящие результаты! Не нужно сортировать при каждом добавлении в массив результатов.

Автотесты
Напишите автотесты на поиск, удостоверившись, что он удовлетворяет условиям задачи. Количество тестов и тестируемые сценарии мы оставляем на ваше усмотрение.