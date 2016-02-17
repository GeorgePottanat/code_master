import React, {Component} from 'react';
import {} from './style.less';

import Header from './Header';
import Footer from './Footer';
import Search from './body/Search';
import Contacts from './body/Contacts';

class App extends Component {
  render() {
    return (
        <div>
        <Header /> 
        <Search />
        <Contacts />
        <Footer />
        </div>
        );
  }
}

export default App;