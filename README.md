# Wyszukiwanie tekstu
Program przeszukuje wszystkie pliki o rozszerzeniu .txt z bieżącego katalogu w poszukiwaniu wzorca podanego z klawiatury.
Jeśli dany wzorzec zostanie znaleziony zostanie on wypisany w terminalu w liście wszystkich odpowiednio pasujących wzorców.
Obok znalezionego wzorca wyświetlona będzie nazwa pliku; numer linii, w której znaleziono wzorzec oraz cały fragment tekstu, w którym ten wzorzec jest zawarty.
Wyszukiwaniy wzorzec jest case-sensitive.

Program zawarty jest w jednym pliku Main.java i korzysta z ogólnodostępnych bibliotek.

Przy pisaniu programu wykorzystałem IDE IntelliJ IDEA Ultimate 2024.1 i skompilowałem go używając kompilatora Javac.
Pobranie dodatkowych paczek nie jest wymagane.

W repozytorium znajdują się także trzy przykładowe pliki .txt.
Ciągi znaków, które można w nich znaleźć to m.in:
- 1234 - zwróci on trzy instancje
- abc - zwróci on kilkadziesiąt instancji

Przykładowe dane wejściowe można stworzyć samemu lub wygenerować poprzez generator plików, który stworzyłem w ten sam sposób co ten program.
Link do repozytorium: https://github.com/jlitwinczuk/generator-plikow
