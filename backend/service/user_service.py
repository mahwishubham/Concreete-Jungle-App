from dao.user_dao import UserDao
from exception.invalid_parameter_value import InvalidParameter
from util.helpers import validate_email, validate_phone, validate_name, validate_password_value
from exception.no_user_error import UserNotFound


class UserService:
    def __init__(self):
        self.user_dao = UserDao()

    def get_user(self, user_id):
        user_obj = self.user_dao.get_user_by_id(user_id)
        if user_obj is None:
            raise UserNotFound(" A user with this id does not exist")
        return user_obj

    def add_user(self, user):
        added_user_obj = 0
        if self.user_dao.get_user(user.email):
            raise InvalidParameter("An email address can only be used once during registration process!")
        if validate_name(user.first_name) and validate_name(user.last_name) and validate_email(user.email) and \
                validate_phone(user.phone) and validate_password_value(user.password):
            added_user_obj = self.user_dao.add_user(user)

        if added_user_obj:
            return added_user_obj.to_dict()
        else:
            raise InvalidParameter("Failed to update database")

    def update_user(self, user, email, first_name, last_name, password, phone):
        """

        Parameters
        ----------
        user
        email
        This is the email user is trying to change. If email already exists or is used by some other user, then
        the current user cannot use this email address.
        first_name
        last_name
        password
        phone

        Returns
        -------

        """

        if self.user_dao.get_user(email):
            raise InvalidParameter("An email address can only be used once during registration process!")
        if not email and not first_name and not last_name and not password and not phone:
            raise InvalidParameter("At least one field is required to submit an update request")
        elif (first_name is None or validate_name(user.first_name)
                and last_name is None or validate_name(user.last_name)
                and email is None or validate_email(user.email)
                and phone is None or validate_phone(user.phone)
                and password is None or validate_password_value(user.password)):
            return self.user_dao.update_user(user, email, first_name, last_name, password, phone).to_dict()
