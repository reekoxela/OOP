import PhoneBase
import view

ph = PhoneBase.Telefon()

def start():

    while True:
        choice = view.menu()
        match choice:
            case 1:
                phones = ph.get_phone()
                view.show_phones(phones)
            case 2:
                new = view.new_phone_input()
                ph.add_phone(new)
            case 3:
                phones = ph.get_phone()
                view.show_phones(phones)
                ind = view.input_id()
                name = ph.get_name(ind)
                if view.confirm('\nПродать телефон ', name):
                    ph.delete_phone(ind)
            case 4:
                print('\nДо свидания!')
                break