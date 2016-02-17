import React, {Component} from 'react';

import LoadContacts from './LoadContacts';

class Contacts extends Component {
  render() {
    return(
<table Nameclass="table" id="table">
<thead>
<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Phone</th>
</tr></thead>
<tbody> 
<tr>
<td><input className="form-control"/></td>
<td><input className="form-control"/></td>
<td><input className="form-control"/></td>
<td><input className="form-control"/></td>
<td><button className="btn btn-primary">Add</button></td>
</tr> 

<LoadContacts />

</tbody>
</table>

    );
  }
}

export default Contacts;