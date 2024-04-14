# Ćwiczenia 

## Zadanie 1 ( branch - zad1)
Utwórz dwa pliki **Company.java** oraz **Employee.java**.
Utwórz w klasie **Employee**:
- pole **prywatne** typu **String, fullName**,
- pole **prywatne** typu **double, salary**,
- metodę **publiczną**, **getName** zwracający **fullName**,
- metodę **publiczną**, **getSalary** zwracającą salary,
- metodę **publiczną**, **setSalary** ustawiającą nową wartość **salary** na podstawie nowej podanej
wartości,
- metodę **publiczną**, **toString** zwracającą informację ``Employee: {{fullName}}, Salary:
{{salary}}``.
Utwórz w klasie **Company**, metodę **main**:
- w której utworzysz tablicę **Employees**,
- dodasz do tablicy **Employees** pięciu pracowników,
- wyświetlisz dane dla pracownika o **indeksie** równym **3**,
- zmodyfikujesz **salary** dla pracownika o **indeksie** równym **3**,
- wyświetlisz dane dla wszystkich pracowników.

## Zadanie 2 ( branch – zad2)
Utwórz paczkę **employees** i przenieś do niego plik **Employee.java**, następnie utwórz w niej
pliki **Manager.java** oraz **Worker.java**, których klasy, dziedziczą po klasie **Employee**.
Utwórz w klasie **Manager**:
- pole **publiczne** – **numberOfSubordinates**,
- metodę **publiczną** – **getNumberOfSubordinates**, zwracającą **numberOfSubordinates**,
- metodę **publiczną** – **setNumberOfSubordinates**, ustawiającą nową wartość
**numberOfSubordinates** na podstawie nowej podanej wartości,
- metodę **publiczną** – **toString**, zwracającą informację ``Manager: {{getFullName}}, Salary:
{{getSalary}}, Subordinates: {{numberOfSubordinates}}``.

Utwórz w klasie **Worker**:
- pole **publiczne** – **position**,
- metodę **publiczną** – **getPosition**, zwracającą position,
- metodę **publiczną** – **setPosition**, ustawiającą nową wartość position na podstawie nowej
podanej wartości,
- metodę **publiczną** – **toString**, zwracającą informację ``Worker: {{getFullName}}, Salary:
{{getSalary}}, Position: {{position}}``.
Zmodyfikuj metodę **main**, tak aby:
- dodawany pracownik o indeksie równym **1** oraz **4**, był instancją klasy **Worker**,
- dodawany pracownik o indeksie równym **0**, był instancją klasy **Manager** zainicjalizowany dla
pola **numberOfSubordinates** wartością **0**,
- wyświetlisz dane dla wszystkich pracowników.

## Zadanie 3 ( branch – zad3)
Zmodyfikuj metodę **main**, tak aby:
- zliczała wszystkich pracowników w tablicy **employees**, którzy nie są instancją klasy **Manager**,
- ustaw zliczoną wartość jako nową wartość **numberOfSubordinates**, pracownika o indeksie
równym **0**,
- ustaw **salary**, pracownika o indeksie równym **0** na **7500**,
- wspomniane w tym zadaniu zmiany (fragment kodu lub jego wywołania, jeżeli są to osobne
metody) znajduje się przed kodem wyświetlającym dane dla wszystkich pracowników a za
całym pozostałym kodem.

## Zadanie 4 ( branch – zad4)
Zmodyfikuj metodę **main**, tak aby:
- dodawał do tablicy **employees** siedmiu pracowników (w tym kolejnego **Manager** oraz
**Worker**),
- ustawić wszystkim pracownikom nową wartość **salary** o **500** wyższą niż ich pierwotna
wartość **salary**,
- ustawi nową wartość pola **numberOfSubordinates** oraz **salary** na **7500** dla obu **Manager**,
- wyświetli zaktualizowane informacje o pracownikach za pomocą metody **toString**.
