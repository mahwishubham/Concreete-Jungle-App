from dotenv import dotenv_values
from flask import Flask
from controller.user_controller import uc
from controller.auth_controller import ac
from controller.tour_controller import tc
from flask_cors import CORS
from flask_session import Session


config = dotenv_values(".env")

if __name__ == "__main__":
    app = Flask(__name__)
    app.secret_key = config['secret_key']
    app.config['SESSION_TYPE'] = 'filesystem'

    CORS(app, origins=['http://mahwish.me:3000', 'http://127.0.0.1:3000', 'http://ec2-54-198-163-233.compute-1.amazonaws.com:3000', 'http://54.198.163.233:3000'],
         supports_credentials=True)

    Session(app)

    app.register_blueprint(uc)
    app.register_blueprint(ac)
    app.register_blueprint(tc)
    app.run(host="0.0.0.0", port=5000, debug=True)


