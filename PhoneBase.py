class Telefon:
    phones: list


    def __init__(self):
        self.phones = []

    def get_phone(self):
        return self.phones

    def add_phone(self, new_phone: dict):
        self.phones.append(new_phone)
        print(f'\nНовый телефон {new_phone.get("mark")} введен!\n')

    def delete_phone(self, ind: int):
        phone = self.phones.pop(ind - 1)
        print(f'Телефон {phone.get("mark")} продан!')

    def get_name(self, ind: int):
        return self.phones[ind - 1].get('nameFactory')
