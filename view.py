def menu():
    print('''\nГлавное меню:
    1. Показать телефоны
    2. Добавить новый телефон 
    3. Продать телефон
    4. Выход''')

    while True:
        try:
            choice = int(input('Выберите пункт меню: '))
            if 0< choice < 5:
                return choice
            else:
                print('Введите число от 1 до 3')
        except:
            print('Выберите пункт меню, цифры от 1 до 3')

def show_phones(ph: list[dict]):
    for i, contact in enumerate(ph, 1):
        nameFactory = contact.get('nameFactory')
        model = contact.get('model')
        sizeDisplay = contact.get('sizeDisplay')
        capacityAKB = contact.get('capacityAKB')
        TypeOS = contact.get('TypeOS')
        price = contact.get('price')
        print(f'{i}. {nameFactory:<15} {model:<15} {sizeDisplay:<10} {capacityAKB:<15} {TypeOS:<10} {price:<10}')

def new_phone_input():
    nameFactory = input('Введите марку телефона: ')
    model = input('Введите модель телефона: ')
    sizeDisplay = input('Введите размер экрана: ')
    capacityAKB = input('Введите емкость аккумулятора: ')
    TypeOS = input('Введите ОС: ')
    price = input('Введите цену: ')
    new_phone = {'nameFactory': nameFactory,
                 'model': model,
                 'sizeDisplay': sizeDisplay,
                 'capacityAKB': capacityAKB,
                 'TypeOS': TypeOS,
                 'price': price}
    return new_phone

def input_id():
    ind = int(input('Введите индекс: '))
    return ind

def confirm(condition: str, name: str):
    answer = input(f'Вы действительно хотите {condition} телефон {name}? (y/n)')
    if answer == 'y':
        return True
    else:
        return False