/*
 * Copyright 2002 - 2013 Pentaho Corporation.  All rights reserved.
 * 
 * This software was developed by Pentaho Corporation and is provided under the terms
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 */

package org.pentaho.pms.cwm.pentaho.meta.businessinformation;

/**
 * ResponsibleParty object instance interface. The ResponsibleParty class allows representation of entities within an
 * information system that are in some way interested in receiving information about, or are otherwise responsible for,
 * particular ModelElements. Each ResponsibleParty may own multiple sets of contact information, and a single
 * ResponsibleParty may be associated with many ModelElements. ResponsibleParty instances may represent any entity
 * appropriate to the system being modeled and need not be limited to people. For example, a Respo nsibleParty instance
 * might represent an individual such as "George Washi
 * ngton", a role (the "President"), or an organization ("Congress"), depending upon the needs of the system being
 * modeled. Similarly, the precise semantics of the responsibility attribute are open to intrepretation and may be adapt
 * ed on a system-by-system basis. Because ResponsibleParty instances are Namespaces, they can be organize d into
 * hierarchies of ResponsibleParty instances, capturing organizational s tructures or similar relationships.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmResponsibleParty extends org.pentaho.pms.cwm.pentaho.meta.core.CwmNamespace {
  /**
   * Returns the value of attribute responsibility. Textual identification or description of the ResponsibleParty in a
   * usage-dependent format.
   * 
   * @return Value of attribute responsibility.
   */
  public java.lang.String getResponsibility();

  /**
   * Sets the value of responsibility attribute. See {@link #getResponsibility} for description on the attribute.
   * 
   * @param newValue
   *          New value to be set.
   */
  public void setResponsibility( java.lang.String newValue );

  /**
   * Returns the value of reference contact.
   * 
   * @return Value of reference contact. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact}
   */
  public java.util.List/* <org.pentaho.pms.cwm.pentaho.meta.businessinformation.CwmContact> */getContact();

  /**
   * Returns the value of reference modelElement.
   * 
   * @return Value of reference modelElement. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getModelElement();
}
