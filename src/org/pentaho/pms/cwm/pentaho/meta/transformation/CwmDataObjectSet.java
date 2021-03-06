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

package org.pentaho.pms.cwm.pentaho.meta.transformation;

/**
 * DataObjectSet object instance interface. This represents a set of data objects that can be the source or target of a
 * Transformation.
 * 
 * <p>
 * <em><strong>Note:</strong> This type should not be subclassed or implemented 
 * by clients. It is generated from a MOF metamodel and automatically implemented 
 * by MDR (see <a href="http://mdr.netbeans.org/">mdr.netbeans.org</a>).</em>
 * </p>
 */
public interface CwmDataObjectSet extends org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement {
  /**
   * Returns the value of reference element.
   * 
   * @return Value of reference element. Element type: {@link org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement}
   */
  public java.util.Collection/* <org.pentaho.pms.cwm.pentaho.meta.core.CwmModelElement> */getElement();

  /**
   * Returns the value of reference sourceTransformation.
   * 
   * @return Value of reference sourceTransformation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation> */getSourceTransformation();

  /**
   * Returns the value of reference targetTransformation.
   * 
   * @return Value of reference targetTransformation. Element type:
   *         {@link org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation}
   */
  public java.util.Collection
    /* <org.pentaho.pms.cwm.pentaho.meta.transformation.CwmTransformation> */getTargetTransformation();
}
