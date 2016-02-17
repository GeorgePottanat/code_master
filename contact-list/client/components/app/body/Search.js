import React, {Component} from 'react';

class Search extends Component {
  render() {
    return(
<div className="input-group" id="adv-search">
    <input type="text" className="form-control" placeholder="Search your Contacts"/>
	<div className="input-group-btn">
		<button type="button" className="btn btn-primary">
		<span className="glyphicon glyphicon-search" aria-hidden="true"></span>
		</button>
	</div>
</div> 
    );
  }
}

export default Search;